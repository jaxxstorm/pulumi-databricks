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
    public sealed class GetJobJobSettingsResult
    {
        public readonly int? CreatedTime;
        public readonly string? CreatorUserName;
        /// <summary>
        /// the id of databricks.Job if the resource was matched by name.
        /// </summary>
        public readonly int? JobId;
        public readonly Outputs.GetJobJobSettingsSettingsResult? Settings;

        [OutputConstructor]
        private GetJobJobSettingsResult(
            int? createdTime,

            string? creatorUserName,

            int? jobId,

            Outputs.GetJobJobSettingsSettingsResult? settings)
        {
            CreatedTime = createdTime;
            CreatorUserName = creatorUserName;
            JobId = jobId;
            Settings = settings;
        }
    }
}