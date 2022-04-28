package lockedme;

import lockedme.MenuOptions;
import lockedme.Operators;
import lockedme.options;

public class main {


		public static void main(String[] args) {
				
				// Create "main" folder if not present in current folder structure
				Operators.createMainFolderIfNotPresent("main");
				
				MenuOptions.printWelcomeScreen("LockedMe", "Nischal B Patil");
				
				options.handleWelcomeScreenInput();
			}

		}

