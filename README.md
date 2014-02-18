Eclipse 3D Petrinet Simulator
===

Introduction
---


Petri nets are used as a means to model systems, but, as they are a mathematical concept, they are not always easy to understand for the ordinary user. Complex systems can be modelled with Petri nets, and usually, this would be an engineer's job. Even though engineers can easily create and understand their own Petri nets, every team member in a company would like to be able to understand what a Petri net is about without having any knowledge of the concepts behind them.

Therefore, the project aims at creating a 3D visualisation from a Petri net, to allow non-Petri net experts to actually get a feel of how the model works to understand and validate a system.

However, this 3D visualisation that we would like to present comes with a problem: Petri nets were not intended to have a 3D representation. For instance, there is no graphical concept or way to say that a particular Petri net would look like a train track because it was used to model a railway system. 

Description of the software
---
This software allows to create a Petri net 3D Visualization using a combination of different editors built for this project. The files created with each of the following editors are to be combined using a configuration editor: Petri net editor, Geometry editor, Appearance editor.

In order to launch a simulation, a user should perform the following actions:

- Create a Petri net model using the Petri net Editor. This editor is used to configure the Petri net.
- Create a Geometry model using the Geometry editor. This editor is used to map objects from the Petri net model to a corresponding Geometry. Geometries include informations about positions/paths in the 3D space. They may also keep a reference to an Appearance to define their texture and shape.
- Create an Appearance file using the Appearance editor. This editor is used to link appearance labels to 3D models. A label corresponds to a specific 3D model file.

Once these three models have been created, the Configuration editor is used by the user to connect every model file previously created in order to be able to start a Simulation. To run the simulation, a specific *Run* button is added to the Configuration editor, which starts the Simulator.
The simulator then initializes the 3D Engine with all the informations needed for the visualization. The 3D Engine then relies on the simulator to know which next move it should perform on the Petri net. To interact with the simulation, the user can either click or press certain keyboard buttons in the GUI for the visualization or click on some elements in the 3D visualization.


Description of the repository
---

The source code of the Eclipse plugin is contained in the *src* folder. For development, all the contained projects have to be imported in Eclipse. Further information can be found in *doc/Handbook.pdf*.

The folder *examples* contains working examples for demo purposes.

The folder *doc* contain final documentation of the whole project, including System Specification, Handbook of the software and Test documentation.

Authors
---

This project has been developed through the course Software Engineering 2 at DTU, and by the following people:

- Albert Fernández [s112213]
- Monica Coman [s130919]
- Thibaud Robelain [s131519]
- Mikko Tuulio [s131630]
- Anders Paludan [s132433]
- Morten Zobbe [s132436]