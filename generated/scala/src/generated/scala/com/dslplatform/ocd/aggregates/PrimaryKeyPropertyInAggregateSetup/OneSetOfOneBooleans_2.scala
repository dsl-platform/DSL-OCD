package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneBooleans_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfOneBooleans: Set[Boolean]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneBooleans_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneBooleans_2("+ URI +")"

   def copy(oneSetOfOneBooleans: Set[Boolean] = this._oneSetOfOneBooleans): OneSetOfOneBooleans_2 = {

  require(oneSetOfOneBooleans ne null, "Null value was provided for property \"oneSetOfOneBooleans\"")
    new OneSetOfOneBooleans_2(_URI = this.URI, __locator = this.__locator, _oneSetOfOneBooleans = oneSetOfOneBooleans)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneBooleans_2): this.type = {
    this._URI = result._URI
    this._oneSetOfOneBooleans = result._oneSetOfOneBooleans
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneBooleans_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfOneBooleans")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneBooleans = {
    _oneSetOfOneBooleans
  }

  def oneSetOfOneBooleans_= (value: Set[Boolean]) {
    _oneSetOfOneBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneBooleans") oneSetOfOneBooleans: Set[Boolean]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfOneBooleans = if (oneSetOfOneBooleans == null) Set.empty else oneSetOfOneBooleans)

}

object OneSetOfOneBooleans_2 extends AggregateRootCompanion[OneSetOfOneBooleans_2]{

  def apply(
    oneSetOfOneBooleans: Set[Boolean] = Set.empty
  ) = {
    require(oneSetOfOneBooleans ne null, "Null value was provided for property \"oneSetOfOneBooleans\"")
    new OneSetOfOneBooleans_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfOneBooleans = oneSetOfOneBooleans)
  }

}
