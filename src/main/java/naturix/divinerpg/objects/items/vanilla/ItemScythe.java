package naturix.divinerpg.objects.items.vanilla;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.enums.BulletType;
import naturix.divinerpg.objects.items.base.RangedWeaponBase;
import naturix.divinerpg.registry.ModSounds;
import naturix.divinerpg.utils.FullSetArmorHelper;
import naturix.divinerpg.utils.TooltipLocalizer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemScythe extends RangedWeaponBase {
    public ItemScythe(String name) {
        super(name,
                null,
                BulletType.SCYTHE_SHOT,
                ModSounds.DEEP_LAUGH,
                SoundCategory.MASTER,
                -1,
                0,
                null,
                0);
    }

    @Override
    protected void spawnEntity(World world, EntityPlayer player, ItemStack stack, BulletType bulletType, Class<? extends EntityThrowable> clazz) {
        FullSetArmorHelper helper = new FullSetArmorHelper(player);
        super.spawnEntity(world, player, stack, helper.isJackoMan()
                        ? BulletType.MEGA_SCYTHE_SHOT
                        : BulletType.SCYTHE_SHOT,
                null);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> list, ITooltipFlag flagIn) {
        FullSetArmorHelper helper = new FullSetArmorHelper(DivineRPG.proxy.getPlayer());
        list.add(TooltipLocalizer.rangedDam(helper.isJackoMan()
                ? BulletType.MEGA_SCYTHE_SHOT.getDamage()
                : BulletType.SCYTHE_SHOT.getDamage()));

        super.addInformation(stack, worldIn, list, flagIn);
    }
}
