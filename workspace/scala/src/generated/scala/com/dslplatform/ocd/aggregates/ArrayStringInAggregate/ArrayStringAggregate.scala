package com.dslplatform.ocd.aggregates.ArrayStringInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ArrayStringAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _arrayString: Array[String]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ArrayStringInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ArrayStringAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ArrayStringAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ArrayStringInAggregate.ArrayStringAggregate): this.type = {
    this.URI = result.URI;
    this._arrayString = result._arrayString;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ArrayStringInAggregate.ArrayStringAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("arrayString")
  def arrayString = {
    _arrayString
  }

  def arrayString_= (value: Array[String]) {
    _arrayString = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("arrayString") arrayString: Array[String]
  ) =
    this(_locator = Some(_locator), _URI = URI, _arrayString = if (arrayString == null) Array.empty else arrayString)

}

object ArrayStringAggregate extends AggregateRootCompanion[ArrayStringAggregate]{

  def apply(
    arrayString: Array[String] = Array.empty
  ) = {
    new ArrayStringAggregate(
      _locator = None
    , _URI = null
    , _arrayString = arrayString)
  }

}
