SUMMARY = "Creat mountpoint for var/lib/docker"
HOMEPAGE = ""
LICENSE = "Private"
PV = "1.0"

S = "${WORKDIR}"

inherit allarch

do_install () {
        install -d ${D}/var/lib/docker
}

FILES_${PN} = "/var/lib/docker"

#create_data_dir() {
#   mkdir -p ${IMAGE_ROOTFS}/var/lib/docker
#}
#
#IMAGE_PREPROCESS_COMMAND += "create_data_dir;"
