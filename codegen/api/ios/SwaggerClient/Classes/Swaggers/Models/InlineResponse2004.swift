//
// InlineResponse2004.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



open class InlineResponse2004: Codable {

    public var result: JSON?


    
    public init(result: JSON? = nil) {
        self.result = result
    }
    

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {

        var container = encoder.container(keyedBy: String.self)

        try container.encodeIfPresent(result, forKey: "result")
    }

    // Decodable protocol methods

    public required init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: String.self)

        result = try container.decodeIfPresent(JSON.self, forKey: "result")
    }
}

