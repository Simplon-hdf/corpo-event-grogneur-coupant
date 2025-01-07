# Regles de gestion

## Gestion des utilisateurs

### Glossaire

- **Admin** : désigne un utilisateur membre de l'entreprise
- **Collaborateur** : désigne une personne collaborant avec l'entreprise
- **Utilisateur** : désigne un collaborateur ou un admin
- **Visiteur** : désigne une personne non connectée

### Gestion des utilisateurs

- **RG01** - Un visiteur peut se connecter
- **RG02** - Un utilisateur peut se déconnecter
- **RG03** - Un visiteur doit se connecter pour acceder au site
- **RG04** - Un admin peut créer un compte collaborateur
- **RG05** - Un admin peut modifier un compte collaborateur
- **RG06** - Un admin peut supprimer un compte utilisateur
- **RG07** - Un utilisateur à un uuid 
- **RG08** - Un utilisateur a un prénom
- **RG09** - Un utilisateur a un nom
- **RG10** - Un utilisateur a un mail
- **RG11** - Un utilisateur a un mot de passe
- **RG12** - Un utilisateur a un role 

### Gestion des évènements

- **RG13** - Un évènement peut être créé par un admin ou un collaborateur
- **RG14** - Un collaborateur peut modifier ses évènements uniquement
- **RG15** - Un collaborateur peut supprimer ses évènements uniquement
- **RG16** - Un admin peut modifier n'importe quel évènement
- **RG17** - Un admin peut supprimer n'importe quel évènement
- **RG18** - Un admin et un collaborteur peuvent commenter un évènement
- **RG19** - Un évènement a un id
- **RG20** - Un évènement a un titre
- **RG21** - Un évènement a une description
- **RG22** - Un évènement a une date de début
- **RG23** - Un évènement a une date de fin
- **RG24** - Un évènement a une section de commentaire

### Gestion des commentaires

- **RG25** - Un commentaire a un id
- **RG26** - Un commentaire a un contenu
- **RG27** - Un commentaire a un auteur
- **RG28** - Un commentaire a un évènement
- **RG29** - Un collaborateur ou un admin peut ajouter un commentaire sur un évènement
- **RG30** - Un collaborateur ou un admin peut modifier son commentaire
- **RG31** - Un admin peut supprimer un commentaire
- **RG32** - Un collaborateur peut supprimer les commentaires de son évènement
- **RG33** - Un collaborateur ou un admin peut supprimer son commentaire