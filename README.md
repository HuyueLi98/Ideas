# Unity learning notes

# English version
--
Function names:
1.Fixedupdate and Update
  Fixedupdate and Update have some differences.
  Framerate is number of frames per second. 
  Variable framerate is what you get when you start the next frame right after the last one stops. The framerate over any section of time   will depend on the performance of the code in it.
  Fixed framerate means that it's always the same, for every single frame.
  A fixed framerate frame is a single cycle of the update loop for a fixed framerate game loop.
  Unity has both a variable framerate loop (Update) and a fixed framerate loop (FixedUpdate). As noted, The FixedUpdate loop is  
  primarily meant for physics in Unity.So put this simply,Fixedupdate is used when you want to do some physics effect in unity.
  Update is primarily used when you want to handle the visual effect.
2.OntriggerEnter
  OnTriggerEnter is called when the Collider other enters the trigger.
  This message is sent to the trigger collider and the rigidbody (or the collider if there is no rigidbody) that touches the trigger.
  Note: Trigger events are only sent if one of the colliders also has a rigidbody attached. Trigger events will be sent to disabled 
  MonoBehaviours, to allow enabling Behaviours in response to collisions.

