package com.elderdrivers.riru.edxp.yahfa.entry.bootstrap;

import com.elderdrivers.riru.common.KeepMembers;
import com.elderdrivers.riru.edxp.yahfa.entry.hooker.HandleBindAppHooker;
import com.elderdrivers.riru.edxp.yahfa.entry.hooker.LoadedApkConstructorHooker;
import com.elderdrivers.riru.edxp.yahfa.entry.hooker.OnePlusWorkAroundHooker;

public class AppBootstrapHookInfo implements KeepMembers {
    public static String[] hookItemNames = {
            HandleBindAppHooker.class.getName(),
            LoadedApkConstructorHooker.class.getName(),
            OnePlusWorkAroundHooker.class.getName()
    };
}
