package metadev.digital.metaskins;

/**
 * Standardize class name in code, so latest builds only need to call latest SkinManager.
 * Update extension to match latest version.
 *
 * When building a final of plugin on certain version, manually pull correct NMS version instead
 * of latest in plugin code to lock in and keep the very rare bugfixes on older versions from pulling
 * an incorrect version.
 *
 * I.E. on 1.22 release replace SkinManager_Latest in plugin code to SkinManager_1_21_RX so you do not
 * accidentally fuck up and forget to replace it in the very unlikely event we get requests (and follow
 * through with) support for an older version later down the line.
 */

public class SkinManager_Latest extends SkinManager_1_21_R1 {
    public SkinManager_Latest() {
        super();
    }


}
