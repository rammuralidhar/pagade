package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by ram.murlidhar on 16-08-2017.
 */
public class PlayScreen implements Screen {
    private MyGdxGame myGdxGame;
    SpriteBatch batch;
    Sprite theWorld;
    private OrthographicCamera camera;
    final float WORLD_WIDTH = 50;
    final float WORLD_HEIGHT = 25;
    public PlayScreen(MyGdxGame myGdxGame) {
        this.myGdxGame = myGdxGame;
        theWorld = new Sprite(new Texture(Gdx.files.internal("TheWorld.png")));
        theWorld.setPosition(0,0);
        theWorld.setSize(50,25);
        batch = new SpriteBatch();
        float aspectRatio = (float)Gdx.graphics.getHeight()/(float)Gdx.graphics.getWidth();

        camera = new OrthographicCamera(25 * aspectRatio ,25);
        camera.position.set(WORLD_WIDTH/2,WORLD_HEIGHT/2,0);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        theWorld.draw(batch);
        batch.end();

    }

    @Override
    public void resize(int width, int height) {}

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
