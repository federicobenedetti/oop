package com.federicobenedetti.oop.Models.Interfaces;

import java.io.Serializable;

/**
 * This interface will provide the 'Serializable' implementation
 * to everyone that need to be serialized (in this case we use it to
 * send data inside HttpRequests, it has to be serialized)
 * <p>
 * Also every class that want to be serialized needs to be a standard java object (bean)
 * with standard getters and setters and at least an empty constructor
 */
public interface ISerializableBean extends Serializable {
}
