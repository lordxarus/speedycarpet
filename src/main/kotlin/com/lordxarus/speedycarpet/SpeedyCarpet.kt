package com.lordxarus.speedycarpet

import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Level
import java.util.logging.Logger

class SpeedyCarpet: JavaPlugin() {

    val log = Logger.getLogger("${javaClass.`package`.name}.${javaClass.canonicalName}").also { it.level = Level.ALL }

    override fun onEnable() {
        log.log(Level.INFO, "SpeedyCarpet Enabled")
    }

    override fun onDisable() {
        log.log(Level.INFO, "SpeedyCarpet Disabled")
    }

}