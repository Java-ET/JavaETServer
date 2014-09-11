package items.weapons;

import items.Asset3D;

import java.util.Vector;

public class Weapon extends Asset3D {
	private boolean canHeadshot;	// You shouldn't be able to get headshots with every weapon.
	private String weaponIconPath;
	private int damage;
	private float spread;
	private String fullName;	// Mainly for external use such as client GUIs
	private String shortName;	// Internal server use only
	private int ammoMagazine;	// ammo for akimbo weapons
	private int magazineCount;	// If set to 0, the weapon in question shouldn't be using magazines at all (Flamethrower). TODO: This is actually class-dependant.
	private Weapon altWeapon;	// Some weapons have "alternative" weapons. A sniper is one weapon but when sniping, it's another weapon.
	private boolean switchToAltWeapAfterUse;	// With a landmine, you should switch to the engineer pliers after tossing the mine.
}
