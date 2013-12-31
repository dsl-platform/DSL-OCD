package com.dslplatform.ocd.aggregates.ArrayMapInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayMapAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayMap: Array[Map[String, String]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayMapInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayMapAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayMapAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayMapInAggregate.ArrayMapAggregate): this.type = {
    this.URI = result.URI;
    this._arrayMap = result._arrayMap;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayMapInAggregate.ArrayMapAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayMap")
  def arrayMap = {
    _arrayMap
  }

  def arrayMap_= (value: Array[Map[String, String]]) {
    _arrayMap = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayMap") arrayMap: Array[Map[String, String]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayMap = if (arrayMap == null) Array.empty else arrayMap)

}

object ArrayMapAggregate extends AggregateRootCompanion[ArrayMapAggregate]{

  def apply(
    arrayMap: Array[Map[String, String]] = Array.empty
  ) = {
    new ArrayMapAggregate(
      _locator = None
    , _URI = null
    , _arrayMap = arrayMap)
  }

}
