FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://blueconf.json"

do_install:append() {
    install -d ${D}${sysconfdir}/blufizz
    install -m 0644 ${UNPACKDIR}/blueconf.json ${D}${sysconfdir}/blufizz/blueconf.json
}

FILES:${PN} += "${sysconfdir}/blufizz/blueconf.json"
CONFFILES:${PN} += "${sysconfdir}/blufizz/blueconf.json"
