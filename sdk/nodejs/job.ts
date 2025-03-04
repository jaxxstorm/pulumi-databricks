// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * The resource job can be imported using the id of the job bash
 *
 * ```sh
 *  $ pulumi import databricks:index/job:Job this <job-id>
 * ```
 */
export class Job extends pulumi.CustomResource {
    /**
     * Get an existing Job resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: JobState, opts?: pulumi.CustomResourceOptions): Job {
        return new Job(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/job:Job';

    /**
     * Returns true if the given object is an instance of Job.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Job {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Job.__pulumiType;
    }

    /**
     * (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `sparkJarTask` or `sparkSubmitTask` or `sparkPythonTask` or `notebookTask` blocks.
     */
    public readonly alwaysRunning!: pulumi.Output<boolean | undefined>;
    public readonly dbtTask!: pulumi.Output<outputs.JobDbtTask | undefined>;
    /**
     * (List) An optional set of email addresses notified when runs of this job begin and complete and when this job is deleted. The default behavior is to not send any emails. This field is a block and is documented below.
     */
    public readonly emailNotifications!: pulumi.Output<outputs.JobEmailNotifications | undefined>;
    /**
     * If existing_cluster_id, the ID of an existing cluster that will be used for all runs of this job. When running jobs on an existing cluster, you may need to manually restart the cluster if it stops responding. We strongly suggest to use `newCluster` for greater reliability.
     */
    public readonly existingClusterId!: pulumi.Output<string | undefined>;
    public readonly format!: pulumi.Output<string>;
    public readonly gitSource!: pulumi.Output<outputs.JobGitSource | undefined>;
    public readonly jobClusters!: pulumi.Output<outputs.JobJobCluster[] | undefined>;
    /**
     * (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
     */
    public readonly libraries!: pulumi.Output<outputs.JobLibrary[] | undefined>;
    /**
     * (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
     */
    public readonly maxConcurrentRuns!: pulumi.Output<number | undefined>;
    /**
     * (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED resultState or INTERNAL_ERROR life_cycle_state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry.
     */
    public readonly maxRetries!: pulumi.Output<number | undefined>;
    /**
     * (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     */
    public readonly minRetryIntervalMillis!: pulumi.Output<number | undefined>;
    /**
     * An optional name for the job. The default value is Untitled.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Same set of parameters as for databricks.Cluster resource.
     */
    public readonly newCluster!: pulumi.Output<outputs.JobNewCluster | undefined>;
    public readonly notebookTask!: pulumi.Output<outputs.JobNotebookTask | undefined>;
    public readonly pipelineTask!: pulumi.Output<outputs.JobPipelineTask | undefined>;
    public readonly pythonWheelTask!: pulumi.Output<outputs.JobPythonWheelTask | undefined>;
    /**
     * (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     */
    public readonly retryOnTimeout!: pulumi.Output<boolean | undefined>;
    /**
     * (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
     */
    public readonly schedule!: pulumi.Output<outputs.JobSchedule | undefined>;
    public readonly sparkJarTask!: pulumi.Output<outputs.JobSparkJarTask | undefined>;
    public readonly sparkPythonTask!: pulumi.Output<outputs.JobSparkPythonTask | undefined>;
    public readonly sparkSubmitTask!: pulumi.Output<outputs.JobSparkSubmitTask | undefined>;
    /**
     * (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    public readonly tasks!: pulumi.Output<outputs.JobTask[] | undefined>;
    /**
     * (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     */
    public readonly timeoutSeconds!: pulumi.Output<number | undefined>;
    /**
     * URL of the job on the given workspace
     */
    public /*out*/ readonly url!: pulumi.Output<string>;

    /**
     * Create a Job resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: JobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: JobArgs | JobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as JobState | undefined;
            resourceInputs["alwaysRunning"] = state ? state.alwaysRunning : undefined;
            resourceInputs["dbtTask"] = state ? state.dbtTask : undefined;
            resourceInputs["emailNotifications"] = state ? state.emailNotifications : undefined;
            resourceInputs["existingClusterId"] = state ? state.existingClusterId : undefined;
            resourceInputs["format"] = state ? state.format : undefined;
            resourceInputs["gitSource"] = state ? state.gitSource : undefined;
            resourceInputs["jobClusters"] = state ? state.jobClusters : undefined;
            resourceInputs["libraries"] = state ? state.libraries : undefined;
            resourceInputs["maxConcurrentRuns"] = state ? state.maxConcurrentRuns : undefined;
            resourceInputs["maxRetries"] = state ? state.maxRetries : undefined;
            resourceInputs["minRetryIntervalMillis"] = state ? state.minRetryIntervalMillis : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["newCluster"] = state ? state.newCluster : undefined;
            resourceInputs["notebookTask"] = state ? state.notebookTask : undefined;
            resourceInputs["pipelineTask"] = state ? state.pipelineTask : undefined;
            resourceInputs["pythonWheelTask"] = state ? state.pythonWheelTask : undefined;
            resourceInputs["retryOnTimeout"] = state ? state.retryOnTimeout : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["sparkJarTask"] = state ? state.sparkJarTask : undefined;
            resourceInputs["sparkPythonTask"] = state ? state.sparkPythonTask : undefined;
            resourceInputs["sparkSubmitTask"] = state ? state.sparkSubmitTask : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tasks"] = state ? state.tasks : undefined;
            resourceInputs["timeoutSeconds"] = state ? state.timeoutSeconds : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as JobArgs | undefined;
            resourceInputs["alwaysRunning"] = args ? args.alwaysRunning : undefined;
            resourceInputs["dbtTask"] = args ? args.dbtTask : undefined;
            resourceInputs["emailNotifications"] = args ? args.emailNotifications : undefined;
            resourceInputs["existingClusterId"] = args ? args.existingClusterId : undefined;
            resourceInputs["format"] = args ? args.format : undefined;
            resourceInputs["gitSource"] = args ? args.gitSource : undefined;
            resourceInputs["jobClusters"] = args ? args.jobClusters : undefined;
            resourceInputs["libraries"] = args ? args.libraries : undefined;
            resourceInputs["maxConcurrentRuns"] = args ? args.maxConcurrentRuns : undefined;
            resourceInputs["maxRetries"] = args ? args.maxRetries : undefined;
            resourceInputs["minRetryIntervalMillis"] = args ? args.minRetryIntervalMillis : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["newCluster"] = args ? args.newCluster : undefined;
            resourceInputs["notebookTask"] = args ? args.notebookTask : undefined;
            resourceInputs["pipelineTask"] = args ? args.pipelineTask : undefined;
            resourceInputs["pythonWheelTask"] = args ? args.pythonWheelTask : undefined;
            resourceInputs["retryOnTimeout"] = args ? args.retryOnTimeout : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["sparkJarTask"] = args ? args.sparkJarTask : undefined;
            resourceInputs["sparkPythonTask"] = args ? args.sparkPythonTask : undefined;
            resourceInputs["sparkSubmitTask"] = args ? args.sparkSubmitTask : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["tasks"] = args ? args.tasks : undefined;
            resourceInputs["timeoutSeconds"] = args ? args.timeoutSeconds : undefined;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Job.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Job resources.
 */
export interface JobState {
    /**
     * (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `sparkJarTask` or `sparkSubmitTask` or `sparkPythonTask` or `notebookTask` blocks.
     */
    alwaysRunning?: pulumi.Input<boolean>;
    dbtTask?: pulumi.Input<inputs.JobDbtTask>;
    /**
     * (List) An optional set of email addresses notified when runs of this job begin and complete and when this job is deleted. The default behavior is to not send any emails. This field is a block and is documented below.
     */
    emailNotifications?: pulumi.Input<inputs.JobEmailNotifications>;
    /**
     * If existing_cluster_id, the ID of an existing cluster that will be used for all runs of this job. When running jobs on an existing cluster, you may need to manually restart the cluster if it stops responding. We strongly suggest to use `newCluster` for greater reliability.
     */
    existingClusterId?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    gitSource?: pulumi.Input<inputs.JobGitSource>;
    jobClusters?: pulumi.Input<pulumi.Input<inputs.JobJobCluster>[]>;
    /**
     * (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
     */
    libraries?: pulumi.Input<pulumi.Input<inputs.JobLibrary>[]>;
    /**
     * (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
     */
    maxConcurrentRuns?: pulumi.Input<number>;
    /**
     * (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED resultState or INTERNAL_ERROR life_cycle_state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry.
     */
    maxRetries?: pulumi.Input<number>;
    /**
     * (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     */
    minRetryIntervalMillis?: pulumi.Input<number>;
    /**
     * An optional name for the job. The default value is Untitled.
     */
    name?: pulumi.Input<string>;
    /**
     * Same set of parameters as for databricks.Cluster resource.
     */
    newCluster?: pulumi.Input<inputs.JobNewCluster>;
    notebookTask?: pulumi.Input<inputs.JobNotebookTask>;
    pipelineTask?: pulumi.Input<inputs.JobPipelineTask>;
    pythonWheelTask?: pulumi.Input<inputs.JobPythonWheelTask>;
    /**
     * (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     */
    retryOnTimeout?: pulumi.Input<boolean>;
    /**
     * (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
     */
    schedule?: pulumi.Input<inputs.JobSchedule>;
    sparkJarTask?: pulumi.Input<inputs.JobSparkJarTask>;
    sparkPythonTask?: pulumi.Input<inputs.JobSparkPythonTask>;
    sparkSubmitTask?: pulumi.Input<inputs.JobSparkSubmitTask>;
    /**
     * (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    tasks?: pulumi.Input<pulumi.Input<inputs.JobTask>[]>;
    /**
     * (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     */
    timeoutSeconds?: pulumi.Input<number>;
    /**
     * URL of the job on the given workspace
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Job resource.
 */
export interface JobArgs {
    /**
     * (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `sparkJarTask` or `sparkSubmitTask` or `sparkPythonTask` or `notebookTask` blocks.
     */
    alwaysRunning?: pulumi.Input<boolean>;
    dbtTask?: pulumi.Input<inputs.JobDbtTask>;
    /**
     * (List) An optional set of email addresses notified when runs of this job begin and complete and when this job is deleted. The default behavior is to not send any emails. This field is a block and is documented below.
     */
    emailNotifications?: pulumi.Input<inputs.JobEmailNotifications>;
    /**
     * If existing_cluster_id, the ID of an existing cluster that will be used for all runs of this job. When running jobs on an existing cluster, you may need to manually restart the cluster if it stops responding. We strongly suggest to use `newCluster` for greater reliability.
     */
    existingClusterId?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    gitSource?: pulumi.Input<inputs.JobGitSource>;
    jobClusters?: pulumi.Input<pulumi.Input<inputs.JobJobCluster>[]>;
    /**
     * (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
     */
    libraries?: pulumi.Input<pulumi.Input<inputs.JobLibrary>[]>;
    /**
     * (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
     */
    maxConcurrentRuns?: pulumi.Input<number>;
    /**
     * (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED resultState or INTERNAL_ERROR life_cycle_state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry.
     */
    maxRetries?: pulumi.Input<number>;
    /**
     * (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     */
    minRetryIntervalMillis?: pulumi.Input<number>;
    /**
     * An optional name for the job. The default value is Untitled.
     */
    name?: pulumi.Input<string>;
    /**
     * Same set of parameters as for databricks.Cluster resource.
     */
    newCluster?: pulumi.Input<inputs.JobNewCluster>;
    notebookTask?: pulumi.Input<inputs.JobNotebookTask>;
    pipelineTask?: pulumi.Input<inputs.JobPipelineTask>;
    pythonWheelTask?: pulumi.Input<inputs.JobPythonWheelTask>;
    /**
     * (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     */
    retryOnTimeout?: pulumi.Input<boolean>;
    /**
     * (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
     */
    schedule?: pulumi.Input<inputs.JobSchedule>;
    sparkJarTask?: pulumi.Input<inputs.JobSparkJarTask>;
    sparkPythonTask?: pulumi.Input<inputs.JobSparkPythonTask>;
    sparkSubmitTask?: pulumi.Input<inputs.JobSparkSubmitTask>;
    /**
     * (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    tasks?: pulumi.Input<pulumi.Input<inputs.JobTask>[]>;
    /**
     * (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     */
    timeoutSeconds?: pulumi.Input<number>;
}
