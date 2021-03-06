package slick.test;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import com.brashmonkey.spriter.file.FileLoader;
import com.brashmonkey.spriter.file.Reference;

public class TextureLoader extends FileLoader<Image>{

	@Override
	public void load(Reference ref, String path) {
		try {
			files.put(ref, new Image(path));
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void finishLoading() {
		// TODO Auto-generated method stub
		
	}
}
