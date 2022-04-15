// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Note** This resource has an evolving API, which may change in future versions of the provider. Please always consult [latest documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default) in case of any questions.
 *
 * This data source constructs necessary AWS cross-account policy for you, which is based on [official documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default).
 *
 * ## Example Usage
 *
 * For more detailed usage please see databricks.getAwsAssumeRolePolicy or databricks.AwsS3Mount pages.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const thisAwsCrossAccountPolicy = pulumi.output(databricks.getAwsCrossAccountPolicy());
 * ```
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide
 * * databricks.getAwsAssumeRolePolicy data to construct the necessary AWS STS assume role policy.
 * * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 */
export function getAwsCrossAccountPolicy(args?: GetAwsCrossAccountPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetAwsCrossAccountPolicyResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("databricks:index/getAwsCrossAccountPolicy:getAwsCrossAccountPolicy", {
        "passRoles": args.passRoles,
    }, opts);
}

/**
 * A collection of arguments for invoking getAwsCrossAccountPolicy.
 */
export interface GetAwsCrossAccountPolicyArgs {
    /**
     * List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
     */
    passRoles?: string[];
}

/**
 * A collection of values returned by getAwsCrossAccountPolicy.
 */
export interface GetAwsCrossAccountPolicyResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * AWS IAM Policy JSON document
     */
    readonly json: string;
    readonly passRoles?: string[];
}

export function getAwsCrossAccountPolicyOutput(args?: GetAwsCrossAccountPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAwsCrossAccountPolicyResult> {
    return pulumi.output(args).apply(a => getAwsCrossAccountPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getAwsCrossAccountPolicy.
 */
export interface GetAwsCrossAccountPolicyOutputArgs {
    /**
     * List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
     */
    passRoles?: pulumi.Input<pulumi.Input<string>[]>;
}