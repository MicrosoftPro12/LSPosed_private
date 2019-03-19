# EdXposed

A Riru module trying to provide a ART hooking framework (initially for Android Pie) which delivers consistent APIs with the OG Xposed, leveraging YAHFA hooking framework.

## Credits 

- [YAHFA](https://github.com/rk700/YAHFA): the core java hooking framework
- [Magisk](https://github.com/topjohnwu/Magisk/): makes all these possible
- [Riru](https://github.com/RikkaApps/Riru): provides a way to inject codes into zygote process
- [XposedBridge](https://github.com/rovo89/XposedBridge): the OG xposed framework APIs
- [dexmaker](https://github.com/linkedin/dexmaker) and [dalvikdx](https://github.com/JakeWharton/dalvik-dx): dynamiclly generate YAHFA hooker classes
- [Whale](https://github.com/asLody/whale): used for inline hooking

## Supported versions

- Android Oreo (8.0, 8.1) 
- Android Pie (9.0)

For devices with Android 7.x and lower, original Xposed is strongly recommended.

## Known issues

- resources hooking is not supported yet
- may not be compatible with all ART devices
- only a few Xposed modules has been tested for working
- file access services are not implemented yet, now simply use magiskpolicy to enable needed SELinux policies

## Build requirements

same as [Riru-Core's](https://github.com/RikkaApps/Riru/blob/master/README.md#build-requirements)
and zip binaries can be downloaded from [here](http://gnuwin32.sourceforge.net/packages/zip.htm)

## Build

1. run `./gradlew :edxp-core:zipRelease` to build flashable zip
2. find the flashable under `edxp-core/release/`
3. flash the zip in recovery mode or in Magisk Manager

## Install

1. make sure Magisk v17.0 or higher is installed.
2. download [Riru-core](https://github.com/RikkaApps/Riru/releases) v10 or higher and install it in Magisk Manager or recovery.
3. download [EdXposed](https://github.com/solohsu/EdXposed/releases) and install it in Magisk Manager or recovery.
4. Install companion application(s)
4. reboot.
5. have fun :)

## Companion applications

- for v0.2.9.5 and before: [Xposed Installer](https://github.com/DVDAndroid/XposedInstaller)
- for v0.2.9.6 and v0.2.9.7: [Xposed Installer](https://github.com/DVDAndroid/XposedInstaller) and [EdXp Manager](https://github.com/solohsu/EdXpManager)(optional)
- for v0.2.9.8 and later: [EdXposed Installer](https://github.com/solohsu/XposedInstaller)
## Get help

- GitHub issues (recommended): [Issues](https://github.com/solohsu/EdXposed/issues/)

- QQ Group: [855219808](http://shang.qq.com/wpa/qunwpa?idkey=fae42a3dba9dc758caf63e971be2564e67bf7edd751a2ff1c750478b0ad1ca3f)

## Contribute

- Apparently this framework is far from stable and all kinds of PRs are welcome. :)
- [Buy me a coffee](https://www.paypal.me/givin2u)

