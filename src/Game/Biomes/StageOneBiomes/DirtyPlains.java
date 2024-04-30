package Game.Biomes.StageOneBiomes;

import Game.Biomes.GenericBiome;
import Game.Entities.Passive.Sheep;
import Game.Tiles.*;
import Library.Map.Tile;

import java.util.HashMap;
import java.util.Random;

public class DirtyPlains extends GenericBiome {
    public DirtyPlains() {
        setTile(1, TileIndex.grass1);
        setTile(2, TileIndex.grass2);
        setTile(3, TileIndex.grass2);
        setTile(4, TileIndex.dirt);
        setTile(5, TileIndex.dirt);
        setTile(6, TileIndex.dirt);
        setTile(7, TileIndex.dirt);
        setTile(8, TileIndex.dirt);
        setTile(9, TileIndex.log);

        setExtraGeneration(new Runnable() {
            @Override
            public void run() {
                Random r = new Random();
                if(r.nextInt(4) == 1) {
                    Game.Main.summonEntity(new Sheep(r.nextInt(16), r.nextInt(16)), 1);
                }
            }
        });
    }
}