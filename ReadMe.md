## Base RPG Template

This project was created by Andrew Ralph a student at Farmingdale State College. It is a simple RPG game created in Java using the Swing library for the GUI.

The game is still in development and below will be a list of features that are currently being worked on and will be added in the future.

Building the game in Java allows for a lot of flexibility and customization, but it also means that there is a lot of work to be done to create a fully functional game. The current focus is on creating the basic mechanics of the game, such as movement and combat, before adding more complex features like quests and leveling.

## Build & Run
Requires a JDK( Java 8 or newer)

<pre>
# compile all sources into bin/
javac -d bin/ src/**/*.java

# run the game
java -cp "bin;res" main.Main
</pre>

The classpath includes 'res' so that the sprite sheets load at runtime

The Java used to run must be the same or newer than the Java used to compile. This project compiles for Java 8, so it runs on 8 or newer. Compiling with a newer JDK and running on Java 8 causes UnsupportedClassVersionError, so make sure to use the same version for both compiling and running.


## Current Features 
- playable character with idle animations
- movement implemented with WASD keys along with proper animations for each direction

## Future Features
- 4 new classes (Archer, Mage, Priest, Warrior)
- 4 new weapons (Bow, Staff, Mace)
- 10 new enemies 
- Health and Mana system
- Inventory system
- Leveling system
- Quests
- Boss fights
- TO BE ESTABLISHED
(these are not the limits of future features, just a list of some of the features that are currently being worked on and will be added in the future)
