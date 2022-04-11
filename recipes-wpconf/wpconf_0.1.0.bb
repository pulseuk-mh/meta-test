SUMMARY = "Copy files for wirepass docker services"
HOMEPAGE = ""
LICENSE = "Private"
PV = "1.0"

SRC_URI = "file://sink.env
	file://other.env"

inherit allarch

do_install() {
install -d {DEPLOYDIR}/${BOOTFILES_DIR_NAME}/wirepas
install -m 0644 ${WORKDIR}sink.env ${D}${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/wirepas/ 
install -m 0644 ${WORKDIR}other.env ${D}${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/wirepas/ 
}

FILES_${PN} += "${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/wirepas/sink.env"
FILES_${PN} += "${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/wirepas/other.env"
