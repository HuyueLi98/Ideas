# Unity learning notes

# English version
--
Function names:  
1.Fixedupdate and Update  
 Fixedupdate and Update have some differences.Variable framerate is what you get when you start the next frame right after the last one stops. The framerate over any section of time   will depend on the performance of the code in it.Fixed framerate means that it's always the same, for every single frame.Unity has both a variable framerate loop (Update) and a fixed framerate loop (FixedUpdate). As noted, The FixedUpdate loop is primarily meant for physics in Unity.So put this simply,Fixedupdate is used when you want to do some physics effect in unity. Update is primarily used when you want to handle the visual effect.  
2.OntriggerEnter    
  OnTriggerEnter is called when the Collider other enters the trigger. This message is sent to the trigger collider and the rigidbody (or the collider if there is no rigidbody) that touches the trigger. Note: Trigger events are only sent if one of the colliders also has a rigidbody attached. Trigger events will be sent to disabled MonoBehaviours, to allow enabling Behaviours in response to collisions.  

3.Colliders
Collider components define the shape of an object for the purposes of physical collisions.A collider,which is invisible,need not to be the exact same shape as the object's mesh and in fact, a rough approximation is oftem more efficient and indistinguishable in gameplay.
 
 4.Quaternion
 Quaternions are used to represent rotations.They are based on complex numbers and are not easy to understand intuitively. You almost never access or modify individual Quaternion components (x,y,z,w); most often you would just take existing rotations (e.g. from the Transform) and use them to construct new rotations (e.g. to smoothly interpolate between two rotations). The Quaternion functions that you use 99% of the time are: Quaternion.LookRotation, Quaternion.Angle, Quaternion.Euler, Quaternion.Slerp, Quaternion.FromToRotation, and Quaternion.identity. (The other functions are only for exotic uses.)
