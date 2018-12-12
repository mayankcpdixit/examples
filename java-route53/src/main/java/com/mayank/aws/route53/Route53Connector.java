package com.mayank.aws.route53.java;

import com.amazonaws.services.route53.AmazonRoute53;
import com.amazonaws.services.route53.AmazonRoute53ClientBuilder;
import com.amazonaws.services.route53.model.ListResourceRecordSetsRequest;
import com.amazonaws.services.route53.model.ListResourceRecordSetsResult;
import lombok.extern.slf4j.Slf4j;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
 
@Slf4j
public class Route53Connector {
    static void FetchRecordSets() throws Exception {
        final String hostedZone = "Z999960JR0YYYB"; // for domain Name:example.io.

        AmazonRoute53 client = AmazonRoute53ClientBuilder.defaultClient();
        ListResourceRecordSetsRequest request2 = new ListResourceRecordSetsRequest(hostedZone);
        ListResourceRecordSetsResult response2 = client.listResourceRecordSets(request2);

        log.info("{}", response2);
    }
    public static void main(String args[]) throws Exception {
        FetchRecordSets();
    }
}
