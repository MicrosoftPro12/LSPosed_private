package com.elderdrivers.riru.edxp.config;

import com.elderdrivers.riru.edxp.hook.HookProvider;

public class EdXpConfigGlobal {

    public static volatile EdXpConfig sConfig;
    public static volatile HookProvider sHookProvider;

    public static EdXpConfig getConfig() {
        if (sConfig == null) {
            return defaultConfig;
        }
        return sConfig;
    }

    public static HookProvider getHookProvider() {
        if (sHookProvider == null) {
            throw new IllegalArgumentException("sHookProvider should not be null.");
        }
        return sHookProvider;
    }


    private static final EdXpConfig defaultConfig = new EdXpConfig() {

        @Override
        public String getInstallerBaseDir() {
            return "";
        }

        @Override
        public String getBlackListModulePackageName() {
            return "";
        }

        @Override
        public boolean isDynamicModulesMode() {
            return false;
        }
    };
}
