
# E-certificate Application

## Table des matières

- [Description](#description)
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Démonstration](#démonstration)

## Description

**E-certificate** est une application Android mobile qui permet aux utilisateurs de s'inscrire à une formation et de recevoir un récapitulatif de leurs informations saisies. L'application offre une interface simple pour collecter des données telles que le nom, prénom, email, numéro de téléphone, adresse, et ville. Après soumission, un récapitulatif des informations saisies est affiché sur une autre page.

## Installation

Pour exécuter ce projet localement, suivez les étapes suivantes :

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/ZinebELHALLA/E-certificates.git
   ```
2. Ouvrez le projet dans **Android Studio**.
3. Laissez Android Studio télécharger les dépendances et configurer le projet.
4. Connectez un appareil Android ou configurez un émulateur.
5. Cliquez sur le bouton **Run** pour lancer l'application.

## Utilisation

1. L'utilisateur peut ouvrir l'application sur son appareil Android ou un émulateur.
2. Sur l'interface principale, l'utilisateur saisit les informations suivantes :
   - Nom
   - Prénom
   - Email
   - Numéro de téléphone
   - Adresse
   - Ville (sélection parmi une liste déroulante)
3. Après avoir rempli le formulaire, l'utilisateur clique sur le bouton **Envoyer**.
4. L'utilisateur est redirigé vers une seconde page affichant un récapitulatif de toutes les informations saisies.

### Structure du projet :

- **app/java/com.example.e_certificate/MainActivity.java** : Contient la logique pour la collecte des données saisies par l'utilisateur et la navigation entre les activités.
- **app/java/com.example.e_certificate/NextActivity.java** : Gère l'affichage des informations récapitulatives dans la seconde activité.
- **app/res/layout/activity_main.xml** : Définit la mise en page de l'écran de saisie des informations.
- **app/res/layout/activity_next.xml** : Définit la mise en page de l'écran de récapitulatif des informations.

## Démonstration

Voici une capture d'écran de l'application en action :


https://github.com/user-attachments/assets/3a715cda-7a2d-49fd-82a3-6c2ed9613625

