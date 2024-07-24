package metadev.digital.metaskins;

import org.bukkit.craftbukkit.v1_21_R1.entity.CraftPlayer;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.minecraft.server.level.EntityPlayer;
import org.bukkit.entity.Player;


public class SkinManager_1_21_R1 implements Skins{
    public SkinManager_1_21_R1(){

    }

    public String[] getSkin(Player player) {
        EntityPlayer playerNMS = ((CraftPlayer)player).getHandle();
        GameProfile profile = playerNMS.getBukkitEntity().getProfile();
        String[] result = new String[2];
        if (profile.getProperties().containsKey("textures")) {
            Property property = (Property) profile.getProperties().get("textures").iterator().next();
            result[0] = property.value();
            result[1] = property.value();
        }

        return result;
    }

    public String getVersion(){
        return "1.21";
    }
}
