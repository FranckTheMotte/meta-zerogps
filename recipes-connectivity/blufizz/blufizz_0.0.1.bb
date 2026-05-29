SUMMARY = "Tool to store the scanned bluetooth and wifi devices. "
DESCRIPTION = "Blufizz is a linux command-line tool that continuously scans for nearby Bluetooth \
(BR/EDR and BLE) and wifi devices. It stores them in a local SQLite database, together with \
optional GPS coordinates and time statistics."
HOMEPAGE = "https://github.com/FranckTheMotte/blufizz"
SECTION = "net"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/FranckTheMotte/blufizz;protocol=https;branch=main"
SRC_URI[sha256sum] = "6ae99f1d4e9d74db7d10373205a3d5f658ab8d28de6af30c7cf982bdea18eef2"
SRCREV = "e3368f356d7f43457392e1f43f44918354c070a5"

S = "${UNPACKDIR}/${PN}-${PV}"
PV = "0.0.1"

DEPENDS = "gpsd nlohmann-json sdbus-c++ sqlite3"

inherit cmake pkgconfig
