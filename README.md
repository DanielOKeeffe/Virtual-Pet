## Virtual Pet Project

Julius is a virtual pet that can be interacted with by feeding him, giving him water, and playing with him. Associated variables called hunger, thirst, and boredom decrease when he is fed, given water, or played with. Hunger, thirst, and boredom increase by 10 with each turn. The three variables are bounded at 0 and 100 to prevent values from being negative or becoming too large.

Additional features:

Julius has a 30% chance of entering a state called "sickness" on each turn. When sick he will not allow the user to feed him, give him water, or play with him instead returning a message stating that he does not feel well and needs medicine. Entering option 4 will "give medicine" which flips the sickness state to false allowing the user to once again interact with Julius. When sick the value of "sickness" is not randomized to prevent Julius from exiting the sickness state without user input. Entering option 4 when sickness is false gives a message that Julius does not need medicine.

To add personality to Julius he has a 30% chance of exercising "free will" after any given user input and executing an action other than the user's input. The alternate action decreases the associated variable by 25. "Free will" is not called for "give medicine" allowing the user to reliably change the state of "sickness".
