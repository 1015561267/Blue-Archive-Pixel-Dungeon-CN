package com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.gun.GL;

import static com.shatteredpixel.shatteredpixeldungeon.Dungeon.hero;

import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfSharpshooting;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.gun.Gun;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
public class GL extends Gun {

    {
        max_round = 2;
        round = max_round;
        reload_time = 4f;
    }

    @Override
    public int bulletMax(int lvl) {
        return 4 * (tier+1) +
                lvl * (tier+1) +
                RingOfSharpshooting.levelDamageBonus(hero);
    }

    @Override
    public Bullet knockBullet(){
        return new GLBullet();
    }

    public class GLBullet extends Bullet {
        {
            image = ItemSpriteSheet.GRENADE_BULLET;
        }
    }
}
