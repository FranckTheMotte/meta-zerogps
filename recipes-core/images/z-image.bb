DESCRIPTION = "A small image just capable of allowing a device to boot and \
is suitable for development work."

SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"
IMAGE_FEATURES += "dev-pkgs"
IMAGE_FEATURES += "empty-root-password allow-empty-password allow-root-login post-install-logging"

IMAGE_FSTYPES += "wic wic.bmap"

