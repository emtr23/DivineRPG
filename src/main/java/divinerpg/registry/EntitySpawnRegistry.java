package divinerpg.registry;

import divinerpg.DivineRPG;
import divinerpg.config.GeneralConfig;
import divinerpg.objects.entities.entity.iceika.EntityAlicanto;
import divinerpg.objects.entities.entity.iceika.EntityFractite;
import divinerpg.objects.entities.entity.iceika.EntityFrostArcher;
import divinerpg.objects.entities.entity.iceika.EntityFrosty;
import divinerpg.objects.entities.entity.iceika.EntityGlacide;
import divinerpg.objects.entities.entity.iceika.EntityHastreus;
import divinerpg.objects.entities.entity.iceika.EntityRollum;
import divinerpg.objects.entities.entity.apalachia.EntityApalachiaCadillion;
import divinerpg.objects.entities.entity.apalachia.EntityApalachiaGolem;
import divinerpg.objects.entities.entity.apalachia.EntityApalachiaTomo;
import divinerpg.objects.entities.entity.mortum.EntityBasilisk;
import divinerpg.objects.entities.entity.arcana.*;
import divinerpg.objects.entities.entity.vethea.*;
import divinerpg.objects.entities.entity.wildwood.EntityBehemoth;
import divinerpg.objects.entities.entity.eden.EntityBunny;
import divinerpg.objects.entities.entity.mortum.EntityDemonOfDarkness;
import divinerpg.objects.entities.entity.eden.EntityEdenCadillion;
import divinerpg.objects.entities.entity.eden.EntityEdenTomo;
import divinerpg.objects.entities.entity.apalachia.EntityEnchantedArcher;
import divinerpg.objects.entities.entity.apalachia.EntityEnchantedWarrior;
import divinerpg.objects.entities.entity.wildwood.EntityEpiphite;
import divinerpg.objects.entities.entity.eden.EntityGreenfeet;
import divinerpg.objects.entities.entity.eden.EntityMadivel;
import divinerpg.objects.entities.entity.skythern.EntityMegalith;
import divinerpg.objects.entities.entity.wildwood.EntityMoonWolf;
import divinerpg.objects.entities.entity.mortum.EntityMortumCadillion;
import divinerpg.objects.entities.entity.skythern.EntitySamek;
import divinerpg.objects.entities.entity.skythern.EntitySkythernArcher;
import divinerpg.objects.entities.entity.skythern.EntitySkythernFiend;
import divinerpg.objects.entities.entity.skythern.EntitySkythernGolem;
import divinerpg.objects.entities.entity.mortum.EntitySoulStealer;
import divinerpg.objects.entities.entity.eden.EntitySunArcher;
import divinerpg.objects.entities.entity.mortum.EntityTwilightArcher;
import divinerpg.objects.entities.entity.wildwood.EntityVerek;
import divinerpg.objects.entities.entity.wildwood.EntityWildwoodCadillion;
import divinerpg.objects.entities.entity.wildwood.EntityWildwoodGolem;
import divinerpg.objects.entities.entity.wildwood.EntityWildwoodTomo;
import divinerpg.objects.entities.entity.skythern.EntityAdvancedCori;
import divinerpg.objects.entities.entity.eden.EntityWeakCori;
import divinerpg.objects.entities.entity.wildwood.EntityMage;
import divinerpg.objects.entities.entity.skythern.EntityMystic;
import divinerpg.objects.entities.entity.mortum.EntitySorcerer;
import divinerpg.objects.entities.entity.apalachia.EntitySpellbinder;
import divinerpg.objects.entities.entity.vanilla.EntityAridWarrior;
import divinerpg.objects.entities.entity.vanilla.EntityCaveCrawler;
import divinerpg.objects.entities.entity.vanilla.EntityCaveclops;
import divinerpg.objects.entities.entity.vanilla.EntityCrab;
import divinerpg.objects.entities.entity.vanilla.EntityCyclops;
import divinerpg.objects.entities.entity.vanilla.EntityDesertCrawler;
import divinerpg.objects.entities.entity.end.EntityEnderSpider;
import divinerpg.objects.entities.entity.end.EntityEnderTriplets;
import divinerpg.objects.entities.entity.end.EntityEnderWatcher;
import divinerpg.objects.entities.entity.vanilla.EntityEnthralledDramcryx;
import divinerpg.objects.entities.entity.vanilla.EntityFrost;
import divinerpg.objects.entities.entity.vanilla.EntityGlacon;
import divinerpg.objects.entities.entity.nether.EntityHellPig;
import divinerpg.objects.entities.entity.nether.EntityHellSpider;
import divinerpg.objects.entities.entity.npc.EntityJackOMan;
import divinerpg.objects.entities.entity.vanilla.EntityJungleBat;
import divinerpg.objects.entities.entity.vanilla.EntityJungleDramcryx;
import divinerpg.objects.entities.entity.vanilla.EntityJungleSpider;
import divinerpg.objects.entities.entity.vanilla.EntityKingCrab;
import divinerpg.objects.entities.entity.vanilla.EntityKobblin;
import divinerpg.objects.entities.entity.vanilla.EntityLiopleurodon;
import divinerpg.objects.entities.entity.vanilla.EntityMiner;
import divinerpg.objects.entities.entity.vanilla.EntityPumpkinSpider;
import divinerpg.objects.entities.entity.vanilla.EntityRainbour;
import divinerpg.objects.entities.entity.vanilla.EntityRotatick;
import divinerpg.objects.entities.entity.vanilla.EntitySaguaroWorm;
import divinerpg.objects.entities.entity.nether.EntityScorcher;
import divinerpg.objects.entities.entity.vanilla.EntityShark;
import divinerpg.objects.entities.entity.vanilla.EntityTheEye;
import divinerpg.objects.entities.entity.vanilla.EntityTheGrue;
import divinerpg.objects.entities.entity.vanilla.EntityWhale;
import divinerpg.objects.entities.entity.nether.EntityWildfire;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.entity.living.LivingSpawnEvent.CheckSpawn;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber
public class EntitySpawnRegistry {

    @Deprecated
    public static void initSpawns() {	
        for (Biome biome : ForgeRegistries.BIOMES.getValues())
            if (biome.equals(BiomeRegistry.biomeIceika)) {
                EntityRegistry.addSpawn(EntityAlicanto.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityFractite.class, 1, 1, 1, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityGlacide.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityHastreus.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityFrostArcher.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityFrosty.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityRollum.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
            } else if (biome.equals(BiomeRegistry.biomeEden)) {
                EntityRegistry.addSpawn(EntityEdenTomo.class, 20, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityEdenCadillion.class, 20, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityBunny.class, 20, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityEdenTomo.class, 20, 4, 4, EnumCreatureType.CREATURE, biome);
                EntityRegistry.addSpawn(EntityEdenCadillion.class, 20, 4, 4, EnumCreatureType.CREATURE, biome);
                EntityRegistry.addSpawn(EntityBunny.class, 20, 4, 4, EnumCreatureType.CREATURE, biome);
                EntityRegistry.addSpawn(EntityWeakCori.class, 1, 4, 4, EnumCreatureType.CREATURE, biome);
                EntityRegistry.addSpawn(EntityWeakCori.class, 1, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityGreenfeet.class, 20, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityMadivel.class, 20, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntitySunArcher.class, 6, 4, 4, EnumCreatureType.CREATURE, biome);
                EntityRegistry.addSpawn(EntitySunArcher.class, 6, 4, 4, EnumCreatureType.MONSTER, biome);
            } else if (biome.equals(BiomeRegistry.biomeWildwood)) {
                EntityRegistry.addSpawn(EntityWildwoodCadillion.class, 4, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityWildwoodTomo.class, 4, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityWildwoodCadillion.class, 4, 4, 4, EnumCreatureType.CREATURE, biome);
                EntityRegistry.addSpawn(EntityWildwoodTomo.class, 4, 4, 4, EnumCreatureType.CREATURE, biome);
                EntityRegistry.addSpawn(EntityEpiphite.class, 1, 2, 2, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityEpiphite.class, 1, 2, 2, EnumCreatureType.CREATURE, biome);
                EntityRegistry.addSpawn(EntityBehemoth.class, 1, 1, 1, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityBehemoth.class, 1, 1, 1, EnumCreatureType.CREATURE, biome);
                EntityRegistry.addSpawn(EntityWildwoodGolem.class, 3, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityVerek.class, 4, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityMage.class, 2, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityMoonWolf.class, 4, 4, 4, EnumCreatureType.CREATURE, biome);
            } else if (biome.equals(BiomeRegistry.biomeApalachia)) {
                EntityRegistry.addSpawn(EntityApalachiaCadillion.class, 2, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityApalachiaGolem.class, 2, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityApalachiaTomo.class, 2, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityEnchantedWarrior.class, 2, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityEnchantedArcher.class, 2, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntitySpellbinder.class, 1, 4, 4, EnumCreatureType.MONSTER, biome);
            } else if (biome.equals(BiomeRegistry.biomeSkythern)) {
                EntityRegistry.addSpawn(EntitySkythernFiend.class, 4, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntitySkythernGolem.class, 4, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntitySkythernArcher.class, 4, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntitySamek.class, 4, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityAdvancedCori.class, 1, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityMystic.class, 2, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityMegalith.class, 1, 4, 4, EnumCreatureType.MONSTER, biome);
            } else if (biome.equals(BiomeRegistry.biomeMortum)) {
                EntityRegistry.addSpawn(EntityDemonOfDarkness.class, 2, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityBasilisk.class, 2, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntitySoulStealer.class, 2, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityMortumCadillion.class, 2, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityTwilightArcher.class, 2, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntitySorcerer.class, 1, 4, 4, EnumCreatureType.MONSTER, biome);
            } else if (biome.equals(BiomeRegistry.biomeArcana)) {
                EntityRegistry.addSpawn(EntityDeathcryx.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityDeathHound.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityDungeonConstructor.class, 1, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityDungeonPrisoner.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityLivingStatue.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityRazorback.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityRoamer.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
            } else if (biome.equals(BiomeRegistry.biomeVethea)) {
                EntityRegistry.addSpawn(EntityAcidHag.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityBiphron.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityBohemite.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityCymesoid.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityDissiment.class, 1, 1, 1, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityDreamwrecker.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityDuo.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityGalroid.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityGorgosion.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityHelio.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                //EntityRegistry.addSpawn(Herbomancer.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityHoverStinger.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityKazrotic.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityLheiva.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityLorga.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityLorgaflight.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityMandragora.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityMysteriousManLayer1.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityMysteriousManLayer3.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityMysteriousManLayer3.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityShadahier.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityTocaxin.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityTwins.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityVermenous.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityVhraak.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityZone.class, 3, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityZoragon.class, 1, 1, 1, EnumCreatureType.MONSTER, biome);
            } else if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.END)) {
                EntityRegistry.addSpawn(EntityEnderSpider.class, 2, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityEnderTriplets.class, 1, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityEnderWatcher.class, 10, 4, 4, EnumCreatureType.MONSTER, biome);
            } else if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.NETHER)) {
                // EntityRegistry.addSpawn(EntityHellBat.class, 50, 1, 1, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityHellPig.class, 25, 5, 50, EnumCreatureType.CREATURE, biome);
                EntityRegistry.addSpawn(EntityHellSpider.class, 50, 1, 1, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityScorcher.class, 7, 4, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityWildfire.class, 50, 1, 1, EnumCreatureType.MONSTER, biome);
            } else if (!(BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))) {
                // All Overworld Biomes
                EntityRegistry.addSpawn(EntityMiner.class, 5, 1, 1, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityJackOMan.class, 5, 1, 1, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityCaveCrawler.class, 70, 2, 3, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityRotatick.class, 70, 3, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityEnthralledDramcryx.class, 70, 3, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityTheEye.class, 30, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityTheGrue.class, 30, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityCaveclops.class, 70, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityEnderSpider.class, 4, 1, 4, EnumCreatureType.MONSTER, biome);
                EntityRegistry.addSpawn(EntityRainbour.class, 1, 1, 1, EnumCreatureType.AMBIENT, biome);

                if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY)) {
                    EntityRegistry.addSpawn(EntityGlacon.class, 30, 1, 1, EnumCreatureType.MONSTER, biome);
                    EntityRegistry.addSpawn(EntityGlacon.class, 30, 1, 1, EnumCreatureType.CREATURE, biome);
                    EntityRegistry.addSpawn(EntityFrost.class, 50, 1, 4, EnumCreatureType.MONSTER, biome);
                }
                if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SANDY)) {
                    EntityRegistry.addSpawn(EntityDesertCrawler.class, 50, 1, 4, EnumCreatureType.MONSTER, biome);
                    EntityRegistry.addSpawn(EntityAridWarrior.class, 35, 1, 4, EnumCreatureType.MONSTER, biome);
                    EntityRegistry.addSpawn(EntitySaguaroWorm.class, 20, 1, 4, EnumCreatureType.MONSTER, biome);
                }
                if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH)) {
                    EntityRegistry.addSpawn(EntityCrab.class, 100, 4, 4, EnumCreatureType.MONSTER, biome);
                    EntityRegistry.addSpawn(EntityKingCrab.class, 40, 4, 4, EnumCreatureType.MONSTER, biome);
                }
                if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.JUNGLE)) {
                    EntityRegistry.addSpawn(EntityJungleBat.class, 50, 1, 4, EnumCreatureType.MONSTER, biome);
                    EntityRegistry.addSpawn(EntityJungleDramcryx.class, 80, 1, 4, EnumCreatureType.MONSTER, biome);
                    EntityRegistry.addSpawn(EntityJungleSpider.class, 80, 1, 4, EnumCreatureType.MONSTER, biome);
                }
                if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.PLAINS)) {
                    EntityRegistry.addSpawn(EntityKobblin.class, 5, 1, 1, EnumCreatureType.MONSTER, biome);
                }
                if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.PLAINS)
                        || BiomeDictionary.hasType(biome, BiomeDictionary.Type.MOUNTAIN)) {
                    EntityRegistry.addSpawn(EntityCyclops.class, 10, 2, 4, EnumCreatureType.MONSTER, biome);
                }
                if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.FOREST)) {
                    EntityRegistry.addSpawn(EntityPumpkinSpider.class, 20, 1, 1, EnumCreatureType.MONSTER, biome);
                }
            }
    }
    
    @SubscribeEvent
	public static void onLivingSpawn(CheckSpawn event) {
    	EntityLivingBase entity = event.getEntityLiving();	
        if (entity.world.getGameRules().getBoolean("doMobSpawning") && entity.world.provider.getDimension() == 0	
                && entity instanceof EntityWaterMob && entity.world.getDifficulty() != EnumDifficulty.PEACEFUL	
                && !entity.world.isRemote	
                && entity.world.getBlockState(entity.getPosition()) == Blocks.WATER.getDefaultState()	
                && (entity.world.getBiome(entity.getPosition()) == Biomes.OCEAN	
                        || entity.world.getBiome(entity.getPosition()) == Biomes.DEEP_OCEAN)) {	


            if (entity.getRNG().nextInt(150) == 0) {	    @Deprecated
                EntityShark shark = new EntityShark(entity.world);	
                shark.copyLocationAndAnglesFrom(entity);	
                entity.world.spawnEntity(shark);	
                entity.setDead();	

                if (GeneralConfig.generalOptions.enableDebugMode == true) {
                    DivineRPG.logger.info(shark.getName() + " just spawned at " + entity.getPosition());	
                }	
            } else if (entity.getRNG().nextInt(250) == 0) {	
                EntityWhale whale = new EntityWhale(entity.world);	
                whale.copyLocationAndAnglesFrom(entity);	
                entity.world.spawnEntity(whale);	
                entity.setDead();	

                if (GeneralConfig.generalOptions.enableDebugMode == true) {
                    DivineRPG.logger.info(whale.getName() + " just spawned at " + entity.getPosition());	
                }	
            } else if (entity.getRNG().nextInt(250) == 0) {	
                EntityLiopleurodon liopleurodon = new EntityLiopleurodon(entity.world);	
                liopleurodon.copyLocationAndAnglesFrom(entity);	
                entity.world.spawnEntity(liopleurodon);	
                entity.setDead();	

                if (GeneralConfig.generalOptions.enableDebugMode == true) {
                    DivineRPG.logger.info(liopleurodon.getName() + " just spawned at " + entity.getPosition());	
                }	
            }
        }
    }
}