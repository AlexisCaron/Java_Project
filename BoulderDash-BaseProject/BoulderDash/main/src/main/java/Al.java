public class Al extends KeyAdapter{
			public void keyPressed(KeyEvent e){
				int keycode = e.getKeyCode();
				
				if(keycode == KeyEvent.VK_UP){
					if(!m.getMap(p.getTileX(), p.getTileY() - 1).equals("C") && !m.getMap(p.getTileX(), p.getTileY() - 1).equals("R")){
						p.move(0, -1);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=1;
					}
				}
				else if(keycode == KeyEvent.VK_DOWN){
					if(!m.getMap(p.getTileX(), p.getTileY() + 1).equals("C") && !m.getMap(p.getTileX(), p.getTileY() + 1).equals("R")){
						p.move(0, 1);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=2;
					}
				}
				else if(keycode == KeyEvent.VK_LEFT){
					if(!m.getMap(p.getTileX() - 1, p.getTileY()).equals("C") && !m.getMap(p.getTileX() - 1, p.getTileY()).equals("R")){
						p.move(-1, 0);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=3;
					}
				}
				else if(keycode == KeyEvent.VK_RIGHT){
					if(!m.getMap(p.getTileX() + 1, p.getTileY()).equals("C") && !m.getMap(p.getTileX() + 1, p.getTileY()).equals("R")){
						p.move(1, 0);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=4;

					}
				}	
			}	
		}	