package com.alcatrazescapee.mcjunitexample;

import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.util.math.BlockPos;

import com.alcatrazescapee.mcjunitlib.framework.IntegrationTest;
import com.alcatrazescapee.mcjunitlib.framework.IntegrationTestClass;
import com.alcatrazescapee.mcjunitlib.framework.IntegrationTestHelper;

@IntegrationTestClass("integration_tests")
public class IntegrationTests
{
    @IntegrationTest("test_repeater_locking")
    public void testRepeaterLocking(IntegrationTestHelper helper)
    {
        helper.pushButton(new BlockPos(0, 1, 0));
        helper.assertBlockAt(new BlockPos(4, 1, 4), state -> state == Blocks.REDSTONE_LAMP.defaultBlockState().setValue(RedstoneLampBlock.LIT, true), "Lamp should be lit");
    }

    @IntegrationTest("test_repeater_locking")
    public void testRepeaterLockingNoButton(IntegrationTestHelper helper)
    {
        helper.assertBlockAt(new BlockPos(4, 1, 4), state -> state == Blocks.REDSTONE_LAMP.defaultBlockState().setValue(RedstoneLampBlock.LIT, true), "Lamp should be lit");
    }
}
