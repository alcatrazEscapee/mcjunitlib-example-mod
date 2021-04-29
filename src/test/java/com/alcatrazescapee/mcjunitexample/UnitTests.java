package com.alcatrazescapee.mcjunitexample;

import net.minecraft.block.Blocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTests
{
    @Test
    public void testPasses()
    {
        assertNotNull(Blocks.STONE.getRegistryName());
        assertEquals("minecraft:stone", Blocks.STONE.getRegistryName().toString());
    }

    @Test
    public void testFails()
    {
        // fail("This test was destined to fail!");
    }
}
