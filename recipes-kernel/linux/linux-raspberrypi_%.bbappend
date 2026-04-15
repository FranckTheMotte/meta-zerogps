FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://bluetooth.cfg \
    file://kernel-debug.cfg \
"
