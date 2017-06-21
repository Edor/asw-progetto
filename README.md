# Progetto ASW
## Descrizione

Progetto per il corso di "Architetture dei sistemi software".

I servizi differiscono in parte da quanto presente nella "Descrizione del dominio", in particolare si è pensato di far restituire "aggettivi" e "riconoscimenti" specifici per il regista "Mel Gibson" e per il regista "Mel Gibson" ed il film "Braveheart", al fine di giustificare almeno in parte la presenza di parametri nell'url delle richieste ai servizi S1 ed S2
=======
La descrizione dettagliata del dominio applicativo è presente in un documento apposito.

## Esecuzione su swarm
Il progetto contiene degli script Linux per rilasciarlo da terminale nello swarm.

L'applicazione risponde all'indirizzo swarm.inf.uniroma3.it:9007/s/*nomeRegista*/*nomeFilm* 

## Esecuzione locale

Il progetto contiene degli script sia per Windows che per Linux per lanciarlo da terminale.

È possibile in alternativa istanziare una macchina virtuale utilizzando Vagrant che contiene già tutte le dipendenze necessarie. Gli script vengono lanciati ad ogni avvio della macchina virtuale.

#### Windows
Raggiungere il file run.bat situato in Environments/shared/scripts/windows e far partire lo script.

#### Vagrant
Raggiungere la cartella Environment/developer/ e lanciare "vagrant up"
E' richiesta un'attesa media di 3 minuti.
=======
È richiesta l'istallazione di Gradle.

#### Linux
Raggiungere la cartella "Environment/shared/scripts" e lanciare "./xterm-gradle.sh"

E' richiesta l'installazione di xterm.

#### Vagrant
Raggiungere la cartella Environment/developer/ e lanciare "vagrant up".

**Nota bene:

Dal rilascio dell'applicazione sullo swarm, volendo comunque eseguirla in locale, occorre modificare le porte sulle quali rispondono i servizi in quanto tutti in ascolto sulla porta 8080.  

