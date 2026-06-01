SUMMARY = "Create /data mountpoint"
LICENSE = "CLOSED"

do_install() {
    install -d ${D}/data
}

FILES:${PN} += "/data"
