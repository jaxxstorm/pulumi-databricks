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
    public sealed class GetJobJobSettingsSettingsNewClusterInitScriptResult
    {
        public readonly Outputs.GetJobJobSettingsSettingsNewClusterInitScriptDbfsResult? Dbfs;
        public readonly Outputs.GetJobJobSettingsSettingsNewClusterInitScriptFileResult? File;
        public readonly Outputs.GetJobJobSettingsSettingsNewClusterInitScriptGcsResult? Gcs;
        public readonly Outputs.GetJobJobSettingsSettingsNewClusterInitScriptS3Result? S3;

        [OutputConstructor]
        private GetJobJobSettingsSettingsNewClusterInitScriptResult(
            Outputs.GetJobJobSettingsSettingsNewClusterInitScriptDbfsResult? dbfs,

            Outputs.GetJobJobSettingsSettingsNewClusterInitScriptFileResult? file,

            Outputs.GetJobJobSettingsSettingsNewClusterInitScriptGcsResult? gcs,

            Outputs.GetJobJobSettingsSettingsNewClusterInitScriptS3Result? s3)
        {
            Dbfs = dbfs;
            File = file;
            Gcs = gcs;
            S3 = s3;
        }
    }
}
