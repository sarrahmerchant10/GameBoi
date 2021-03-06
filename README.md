# GameBoi
GameBoi is a 3 in one game including a math, flashcolours, and rock paper scissors game. A user can be created and saved in a file, including customizations such as icon, background colour, number of lives, username and the difficulty of the levels they wish to play. If a user leaves midway, the game restarts at the point at which they left.
GameBoi README.txt

############### GENERAL OVERVIEW ###############

The game starts at a login screen that shows 3 users that are in the file. If no users have been
created then you may choose the button and create a new user. If you wish to create a new user you
will be taken to a new screen that lets you pick your 3 customizations for your user. The
customizations are icon, background colour and  number of lives. After the customizations are
complete you will begin playing the Math Game, then Flash colours and lastly the player plays the
Rock Paper Scissors game. Finally, the player visits the final screen which is a leader board screen
which displays the top three scorers that have played Gameboi. The leaderboard can also be sorted by
other player stats such as current score, highscore, multiplier, lives.

Icon Images Link:
Boy: https://images.app.goo.gl/bBxsHPLu6xqSTvQG6
Panda: https://www.cleanpng.com/png-po-master-shifu-tigress-giant-panda-kung-fu-panda-674481/
Snake: https://www.cleanpng.com/png-cartoon-clip-art-red-snake-1278542/download-png.html

################## MATH GAME ##################

Asks the player a series of math questions. If the player answers 3 incorrectly they lose a
life and the game ends. Every question they answer corrected adds 1 point to the score. There are a
total of 10 possible rounds. After the player completes the Math game with more than 0 lives,
they move on to the FLash colours game.


################ Flash Colours ################

Asks player to press the start button at which point the colours will start to flash at random. The
player must remember the pattern and click the colours corresponding to the pattern they saw. If they
correctly identified the pattern, a message saying they earned a point will appear. If they lose two
rounds then they lose the Flash colours game. A total of 4 rounds will be played. After the player
completes the Flash colours game they move on to the LevelResults to see their current stats and
then the BonusSpinner to increase their multiplier. The next game is then Rock Paper Scissors game.

There is a hidden feature of this level where if the player enters a particular combination based on
their chosen difficulty, their multiplier is increased by 2.
Normal: Blue, Red, Green Yellow
Hard: Blue, White, Red, Green, Yellow, Black

The links below refer to pages where code was found. These sources were used to help implement flash
colours, as well as in FileManager where a file needs to be written to.
https://stackoverflow.com/questions/15582434/using-a-valueanimator-to-make-a-textview-blink-different-colors
https://android.okhelp.cz/get-resource-id-by-resources-string-name-android-example/
https://stackoverflow.com/questions/14376807/how-to-read-write-string-from-a-file-in-android


########## Rock Paper Scissors Game ##########

====== Easy Level ======
Lets the player play a game of rock paper scissors against the computer. If the player loses 2
rounds first then they lose the rock paper scissors game. If the player wins 3 rounds before losing
two rounds, then they win the rock paper scissors game.

Hidden Feature:
In the easy round the player needs to select Scissors and the computer needs to randomly choose
Rock. The combo "Scissors", "Rock" is the hidden feature.

====== Hard Level ======
Hidden Feature:



Rock Paper Scissors Game Images Links:
https://www.google.com/search?q=rock+paper+scissors&safe=strict&rlz=1C5CHFA_enCA813CA813&sxsrf=
ACYBGNQS9cRDl2C1Wd8-FqzXX9cLZrWkdQ:1572550321774&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi-isi6nsflAh
VKh-AKHV8TBWoQ_AUIEigB&biw=1440&bih=714#imgdii=mR-t7MrFmrZlgM:&imgrc=NNOq5QMe9uhqwM:

################ Bonus Spinner ################

This is where the player has the opportunity to increase their multiplier. The player would press
the SPIN button to have the wheel rotate. Whichever section of the Bonus Wheel that it lands on,
denoted by the arrow pointer at the top, is then multiplied by the User's current multiplier to get
a new multiplier. The multiplier can be increased by 1x, 2x, 3x.

Bonus Spinner Source:
The spinnerwheel.png and pointer.png were made from scratch using Figma to draw the images.
The following source was used to implement the spinning wheel which is based on a Roulette wheel:
https://medium.com/@ssaurel/develop-a-roulette-game-for-android-316e349f91a

https://www.google.com/search?q=rock+paper+scissors+lizard+spock&safe=strict&rlz=1C5CHFA_enCA813C
A813&sxsrf=ACYBGNSPz50uSWxsfkoIE6NW_ztJNKFDjg:1575248475528&source=lnms&tbm=isch&sa=X&ved=2ahUKEw
jeh8Tu4ZXmAhVTqp4KHcUeCEsQ_AUoAXoECAsQAw&biw=1440&bih=667#imgrc=Bd0v3Or7mvBbCM:
