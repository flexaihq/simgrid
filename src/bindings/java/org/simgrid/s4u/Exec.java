/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.simgrid.s4u;

public class Exec extends Activity {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Exec(long cPtr, boolean cMemoryOwn) {
    super(cPtr, true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Exec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwnDerived) {
      swigCMemOwnDerived = false;
      simgridJNI.delete_Exec(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public static Exec init() {
    long cPtr = simgridJNI.Exec_init();
    return (cPtr == 0) ? null : new Exec(cPtr, true);
  }

  public double get_remaining() {
    return simgridJNI.Exec_get_remaining(swigCPtr, this);
  }

  public double get_remaining_ratio() {
    return simgridJNI.Exec_get_remaining_ratio(swigCPtr, this);
  }

  public Exec set_host(Host host) {
    simgridJNI.Exec_set_host(swigCPtr, this, Host.getCPtr(host), host);
    return this;
  }

  public Exec set_hosts(SWIGTYPE_p_std__vectorT_simgrid__s4u__Host_p_t hosts) {
    simgridJNI.Exec_set_hosts(swigCPtr, this, SWIGTYPE_p_std__vectorT_simgrid__s4u__Host_p_t.getCPtr(hosts));
    return this;
  }

  public Exec unset_host() {
    simgridJNI.Exec_unset_host(swigCPtr, this);
    return this;
  }

  public Exec unset_hosts() {
    simgridJNI.Exec_unset_hosts(swigCPtr, this);
    return this;
  }

  public Exec set_flops_amount(double flops_amount) {
    simgridJNI.Exec_set_flops_amount(swigCPtr, this, flops_amount);
    return this;
  }

  public Exec set_flops_amounts(SWIGTYPE_p_std__vectorT_double_t flops_amounts) {
    simgridJNI.Exec_set_flops_amounts(swigCPtr, this, SWIGTYPE_p_std__vectorT_double_t.getCPtr(flops_amounts));
    return this;
  }

  public Exec set_bytes_amounts(SWIGTYPE_p_std__vectorT_double_t bytes_amounts) {
    simgridJNI.Exec_set_bytes_amounts(swigCPtr, this, SWIGTYPE_p_std__vectorT_double_t.getCPtr(bytes_amounts));
    return this;
  }

  public Exec set_thread_count(int thread_count) {
    simgridJNI.Exec_set_thread_count(swigCPtr, this, thread_count);
    return this;
  }

  public Exec set_bound(double bound) {
    simgridJNI.Exec_set_bound(swigCPtr, this, bound);
    return this;
  }

  public Exec set_priority(double priority) {
    simgridJNI.Exec_set_priority(swigCPtr, this, priority);
    return this;
  }

  public Exec update_priority(double priority) {
    simgridJNI.Exec_update_priority(swigCPtr, this, priority);
    return this;
  }

  public Host get_host() {
    long cPtr = simgridJNI.Exec_get_host(swigCPtr, this);
    return (cPtr == 0) ? null : new Host(cPtr, true);
  }

  public long get_host_number() {
    return simgridJNI.Exec_get_host_number(swigCPtr, this);
  }

  public int get_thread_count() {
    return simgridJNI.Exec_get_thread_count(swigCPtr, this);
  }

  public double get_cost() {
    return simgridJNI.Exec_get_cost(swigCPtr, this);
  }

  public boolean is_parallel() {
    return simgridJNI.Exec_is_parallel(swigCPtr, this);
  }

  public boolean is_assigned() {
    return simgridJNI.Exec_is_assigned(swigCPtr, this);
  }
  
  public Exec await() {
    await_for(-1);
    return this;
  }

  public static void on_start_cb(CallbackExec cb) { simgridJNI.Exec_on_start_cb(cb); }

  public void on_this_start_cb(CallbackExec cb) { simgridJNI.Exec_on_this_start_cb(swigCPtr, this, cb); }

  public static void on_completion_cb(CallbackExec cb) { simgridJNI.Exec_on_completion_cb(cb); }

  public void on_this_completion_cb(CallbackExec cb) { simgridJNI.Exec_on_this_completion_cb(swigCPtr, this, cb); }

  public void on_this_suspend_cb(CallbackExec cb) { simgridJNI.Exec_on_this_suspend_cb(swigCPtr, this, cb); }

  public void on_this_resume_cb(CallbackExec cb) { simgridJNI.Exec_on_this_resume_cb(swigCPtr, this, cb); }

  public static void on_veto_cb(CallbackExec cb) { simgridJNI.Exec_on_veto_cb(cb); }

  public void on_this_veto_cb(CallbackExec cb) { simgridJNI.Exec_on_this_veto_cb(swigCPtr, this, cb); }

  public Exec add_successor(Activity a) {
    simgridJNI.Exec_add_successor(swigCPtr, this, Activity.getCPtr(a), a);
    return this;
  }

  public Exec remove_successor(Activity a) {
    simgridJNI.Exec_remove_successor(swigCPtr, this, Activity.getCPtr(a), a);
    return this;
  }

  public Exec set_name(String name) {
    simgridJNI.Exec_set_name(swigCPtr, this, name);
    return this;
  }

  public String get_name() {
    return simgridJNI.Exec_get_name(swigCPtr, this);
  }

  public Exec set_tracing_category(String category) {
    simgridJNI.Exec_set_tracing_category(swigCPtr, this, category);
    return this;
  }

  public String get_tracing_category() {
    return simgridJNI.Exec_get_tracing_category(swigCPtr, this);
  }

  public Exec detach() {
    simgridJNI.Exec_detach__SWIG_0(swigCPtr, this);
    return this;
  }

  public Exec detach(SWIGTYPE_p_std__functionT_void_fvoid_pF_t clean_function) {
    simgridJNI.Exec_detach__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__functionT_void_fvoid_pF_t.getCPtr(clean_function));
    return this;
  }

  public Exec cancel() {
    simgridJNI.Exec_cancel(swigCPtr, this);
    return this;
  }

  public Exec await_for(double timeout)
  {
    simgridJNI.Exec_await_for(swigCPtr, this, timeout);
    return this;
  }
}
