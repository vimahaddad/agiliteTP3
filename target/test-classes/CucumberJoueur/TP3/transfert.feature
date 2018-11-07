Feature: transfert un joueur

Scenario Outline: mettre les équipes à jours aux changements.

Given la création de <joueur 1> qui appartient de <equipe 1>
When le manager valide le transfert du <joueur 1> de <equipe 1> à <equipe 2>
Then l'équipe de joueur après le transfert sera <equipe 2>

Examples:
| joueur 1	| equipe 1	| equipe 2	|
| Umtiti		| cameroun	| france		|