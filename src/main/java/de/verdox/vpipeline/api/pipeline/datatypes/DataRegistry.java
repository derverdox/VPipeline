package de.verdox.vpipeline.api.pipeline.datatypes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

/**
 * @version 1.0
 * @Author: Lukas Jonsson (Verdox)
 * @date 18.06.2022 13:15
 */
public interface DataRegistry {
    <S extends IPipelineData> void registerType(@NotNull String classifier, @NotNull Class<? extends S> type);

    Set<Class<? extends IPipelineData>> getAllTypes(@NotNull String... classifiers);

    default <S extends IPipelineData> void registerType(@NotNull Class<? extends S> type) {
        registerType("", type);
    }

    @Nullable
    Class<? extends IPipelineData> getTypeByStorageId(@NotNull String storageIdentifier);
}
