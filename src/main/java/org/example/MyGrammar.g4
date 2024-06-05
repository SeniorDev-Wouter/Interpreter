grammar MyGrammar;

INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;

KLEINERDAN: 'kleiner dan';
GROTERDAN: 'groter dan';
WANNEER: 'wanneer' | 'Wanneer';
MIJN: 'mijn';
DAN: 'dan';
IK: ' ik ';
PUNT: '.';

agent: regel+ | EOF;

regel: spelsituatie;
spelsituatie: WANNEER MIJN attribuut vergelijkingsOperator INT DAN actie PUNT;
actie: beweeg | valAan;
beweeg: actieWerkwoord IK richting;
valAan: actieWerkwoord IK doelwit ' aan';
richting: 'naar ' ( 'de val' | 'het goud' | 'de deur' | 'de trap' | 'de kist' );
doelwit: 'de kobold' | 'de draak' | 'de grote boze pinda';
vergelijkingsOperator: KLEINERDAN | GROTERDAN;
attribuut: 'gezondheid' | 'verdediging' | 'aanval' | 'snelheid' | 'kracht';
actieWerkwoord: 'beweeg' | 'val';
