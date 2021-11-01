package command_pattern.command.ceilingfan

import command_pattern.command.Command
import command_pattern.receiver.CeilingFan

class CeilingFanOffCommand(private val ceilingFan: CeilingFan): Command {
    private var prevSpeed: Int = CeilingFan.OFF
    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.off()
    }

    override fun undo() {
        when(prevSpeed) {
            CeilingFan.HIGH -> ceilingFan.high()
            CeilingFan.LOW -> ceilingFan.low()
            CeilingFan.MEDIUM -> ceilingFan.medium()
            CeilingFan.OFF -> ceilingFan.off()
        }
    }
}