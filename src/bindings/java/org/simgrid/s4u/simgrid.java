/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.simgrid.s4u;

public class simgrid {
  public static void parallel_execute(SWIGTYPE_p_std__vectorT_simgrid__s4u__Host_p_t hosts, SWIGTYPE_p_std__vectorT_double_t flops_amounts, SWIGTYPE_p_std__vectorT_double_t bytes_amounts) {
    simgridJNI.parallel_execute(SWIGTYPE_p_std__vectorT_simgrid__s4u__Host_p_t.getCPtr(hosts), SWIGTYPE_p_std__vectorT_double_t.getCPtr(flops_amounts), SWIGTYPE_p_std__vectorT_double_t.getCPtr(bytes_amounts));
  }

  public static void on_exit(SWIGTYPE_p_std__functionT_void_fboolF_t fun) {
    simgridJNI.on_exit(SWIGTYPE_p_std__functionT_void_fboolF_t.getCPtr(fun));
  }

  public static SWIGTYPE_p_std__vectorT_boost__intrusive_ptrT_simgrid__s4u__Activity_t_t create_DAG_from_dot(String filename) {
    return new SWIGTYPE_p_std__vectorT_boost__intrusive_ptrT_simgrid__s4u__Activity_t_t(simgridJNI.create_DAG_from_dot(filename), true);
  }

  public static SWIGTYPE_p_std__vectorT_boost__intrusive_ptrT_simgrid__s4u__Activity_t_t create_DAG_from_DAX(String filename) {
    return new SWIGTYPE_p_std__vectorT_boost__intrusive_ptrT_simgrid__s4u__Activity_t_t(simgridJNI.create_DAG_from_DAX(filename), true);
  }

  public static SWIGTYPE_p_std__vectorT_boost__intrusive_ptrT_simgrid__s4u__Activity_t_t create_DAG_from_json(String filename) {
    return new SWIGTYPE_p_std__vectorT_boost__intrusive_ptrT_simgrid__s4u__Activity_t_t(simgridJNI.create_DAG_from_json(filename), true);
  }

  public static NetZone create_full_zone(String name) {
    long cPtr = simgridJNI.create_full_zone(name);
    return (cPtr == 0) ? null : new NetZone(cPtr, false);
  }

  public static NetZone create_star_zone(String name) {
    long cPtr = simgridJNI.create_star_zone(name);
    return (cPtr == 0) ? null : new NetZone(cPtr, false);
  }

  public static NetZone create_dijkstra_zone(String name, boolean cache) {
    long cPtr = simgridJNI.create_dijkstra_zone(name, cache);
    return (cPtr == 0) ? null : new NetZone(cPtr, false);
  }

  public static NetZone create_empty_zone(String name) {
    long cPtr = simgridJNI.create_empty_zone(name);
    return (cPtr == 0) ? null : new NetZone(cPtr, false);
  }

  public static NetZone create_floyd_zone(String name) {
    long cPtr = simgridJNI.create_floyd_zone(name);
    return (cPtr == 0) ? null : new NetZone(cPtr, false);
  }

  public static NetZone create_vivaldi_zone(String name) {
    long cPtr = simgridJNI.create_vivaldi_zone(name);
    return (cPtr == 0) ? null : new NetZone(cPtr, false);
  }

  public static NetZone create_wifi_zone(String name) {
    long cPtr = simgridJNI.create_wifi_zone(name);
    return (cPtr == 0) ? null : new NetZone(cPtr, false);
  }

  public static NetZone create_torus_zone(String name, NetZone parent, SWIGTYPE_p_std__vectorT_unsigned_long_t dimensions, ClusterCallbacks set_callbacks, double bandwidth, double latency, Link.SharingPolicy sharing_policy) {
    long cPtr = simgridJNI.create_torus_zone(name, NetZone.getCPtr(parent), parent, SWIGTYPE_p_std__vectorT_unsigned_long_t.getCPtr(dimensions), ClusterCallbacks.getCPtr(set_callbacks), set_callbacks, bandwidth, latency, sharing_policy.swigValue());
    return (cPtr == 0) ? null : new NetZone(cPtr, false);
  }

  public static NetZone create_fatTree_zone(String name, NetZone parent, FatTreeParams parameters, ClusterCallbacks set_callbacks, double bandwidth, double latency, Link.SharingPolicy sharing_policy) {
    long cPtr = simgridJNI.create_fatTree_zone(name, NetZone.getCPtr(parent), parent, FatTreeParams.getCPtr(parameters), parameters, ClusterCallbacks.getCPtr(set_callbacks), set_callbacks, bandwidth, latency, sharing_policy.swigValue());
    return (cPtr == 0) ? null : new NetZone(cPtr, false);
  }

  public static NetZone create_dragonfly_zone(String name, NetZone parent, DragonflyParams parameters, ClusterCallbacks set_callbacks, double bandwidth, double latency, Link.SharingPolicy sharing_policy) {
    long cPtr = simgridJNI.create_dragonfly_zone(name, NetZone.getCPtr(parent), parent, DragonflyParams.getCPtr(parameters), parameters, ClusterCallbacks.getCPtr(set_callbacks), set_callbacks, bandwidth, latency, sharing_policy.swigValue());
    return (cPtr == 0) ? null : new NetZone(cPtr, false);
  }

}
