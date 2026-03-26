DESCRIPTION:append = "Customization of raspberri config. Only tested with Zero 2W"

do_deploy:append() {
    CONFIG=${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt

    # UART 2nd stage support
    echo "# UART 2nd stage" >>$CONFIG
    echo "uart_2ndstage=1" >>$CONFIG
}
