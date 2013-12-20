How to run the Extended Petri net Simulator
====

Deliverables attached:
-----------------

* extended_petrinet.zip
* examples.zip
* README.txt
* SystemSpecification.pdf
* Handbook.pdf
* TestDocumentation.pdf
* author-tags.txt

Set up Eclipse Development
-----

First, the eclipse projects in extended_petrinet.zip have to be imported into Eclipse as projects. Moreover, the project jMonkeyEclipse that can be found in the following subversion URL needs to be checked out as well (it has been updated since first prototype, and therefore needs to be updated too).

https://svn.imm.dtu.dk/se2/svn/e13-groupA/src/jMonkeyEclipse

Running the editors
----

Once Eclipse has been set up, the runtime eclipse can be runned, and the Eclipse project 'examples' in examples.zip can be imported. This project contains an already created PNML document, geometry model, appeance model and configuration model.

In order to run the simulator, the configuration file has to be opened, right click in 'Configuration' in the Tree view, and click on 'Start Simulation'.

Running the simulation
------

Simulation can be started by clicking on 'Start' button, paused by clicking again, as well as reseted by clicking on 'Reset'. 


A second simulator cannot be launched due to the implementation of jMonkey.