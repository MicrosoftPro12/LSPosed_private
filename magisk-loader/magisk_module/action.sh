DEFAULT_MANAGER_PACKAGE_NAME=org.lsposed.manager
INJECTED_PACKAGE_NAME=com.android.shell

am start -c "${DEFAULT_MANAGER_PACKAGE_NAME}.LAUNCH_MANAGER" "${INJECTED_PACKAGE_NAME}/.BugreportWarningActivity"

echo "Launched LSPosed Manager. This dialog will close in 5 seconds."
sleep 5
exit 0