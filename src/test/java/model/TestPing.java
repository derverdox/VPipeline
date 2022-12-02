package model;

import de.verdox.vpipeline.api.messaging.instruction.types.Ping;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;

/**
 * @version 1.0
 * @Author: Lukas Jonsson (Verdox)
 * @date 23.06.2022 14:00
 */
public class TestPing extends Ping {
    public TestPing(@NotNull UUID uuid) {
        super(uuid);
    }

    @Override
    public List<Class<?>> instructionDataTypes() {
        return List.of(Integer.class);
    }

    @Override
    public void onPingReceive(Object[] instructionData) {

    }
}
