1️⃣Intégrer SpringDoc au niveau du projet SKI et ajouter les annotations nécessaires pour bien documenter les services.

2️⃣Réaliser les services suivants :
  Entité Skieur  
 - Pour l’ajout de Skieur, il faut créer en même temps son abonnement (l’entité associée Abonnement )
 - Pour la suppression de Skieur, il faut supprimer en même temps son abonnement
Services avancés
- Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier)
- Registration assignRegistrationToCourse(Long numRegistration, Long numCourse)
- Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
-  Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse);
