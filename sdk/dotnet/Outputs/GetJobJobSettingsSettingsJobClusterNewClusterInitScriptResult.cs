// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetJobJobSettingsSettingsJobClusterNewClusterInitScriptResult
    {
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfsResult? Dbfs;
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFileResult? File;
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcsResult? Gcs;
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3Result? S3;

        [OutputConstructor]
        private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptResult(
            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfsResult? dbfs,

            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFileResult? file,

            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcsResult? gcs,

            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3Result? s3)
        {
            Dbfs = dbfs;
            File = file;
            Gcs = gcs;
            S3 = s3;
        }
    }
}