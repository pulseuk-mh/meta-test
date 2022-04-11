SUMMARY = "Copy files for wirepass docker services"
HOMEPAGE = ""
LICENSE = "Private"
PV = "1.0"

SRC_URI = "file://sink.env"
SRC_URI += "file://other.env"

do_install() {
install -d boot/wirepas
install -m 0644 ${WORKDIR}sink.env ${D}boot/wirepas/ 
install -m 0644 ${WORKDIR}other.env ${D}boot/wirepas/ 
##install -d {DEPLOYDIR}/${BOOTFILES_DIR_NAME}/wirepas
##install -m 0644 ${WORKDIR}sink.env ${D}${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/wirepas/ 
##install -m 0644 ${WORKDIR}other.env ${D}${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/wirepas/ 
}

FILES_${PN} += "boot/wirepas/sink.env"
FILES_${PN} += "boot/wirepas/other.env"
